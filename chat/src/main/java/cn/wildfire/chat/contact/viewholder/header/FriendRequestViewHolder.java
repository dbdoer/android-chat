package cn.wildfire.chat.contact.viewholder.header;

import androidx.fragment.app.Fragment;
import android.view.View;
import android.widget.TextView;

import cn.wildfirechat.chat.R;
import cn.wildfire.chat.annotation.LayoutRes;
import cn.wildfire.chat.contact.ContactAdapter;
import cn.wildfire.chat.contact.model.FriendRequestValue;

import butterknife.Bind;
import butterknife.ButterKnife;

@SuppressWarnings("unused")
@LayoutRes(resId = R.layout.contact_header_friend)
public class FriendRequestViewHolder extends HeaderViewHolder<FriendRequestValue> {
    @Bind(R.id.unreadFriendRequestCountTextView)
    TextView unreadRequestCountTextView;
    private FriendRequestValue value;


    public FriendRequestViewHolder(Fragment fragment, ContactAdapter adapter, View itemView) {
        super(fragment, adapter, itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void onBind(FriendRequestValue value) {
        this.value = value;
        if (value.getUnreadRequestCount() > 0) {
            unreadRequestCountTextView.setVisibility(View.VISIBLE);
            unreadRequestCountTextView.setText("" + value.getUnreadRequestCount());
        } else {
            unreadRequestCountTextView.setVisibility(View.GONE);
        }
    }
}