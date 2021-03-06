package com.qioq.android.lib.video.plugins.entry;

import android.view.ViewGroup;
import com.andcup.android.frame.plugin.core.PluginContext;
import com.andcup.android.frame.plugin.core.model.Mode;
import com.andcup.android.frame.plugin.core.model.PluginEntry;
import com.nd.hy.android.video.R;
import com.qioq.android.lib.video.core.listener.OnFullScreenListener;
import com.qioq.android.lib.video.engine.widget.VideoView;
import com.qioq.android.lib.video.VideoPlugin;

/**
 * Created by Amos on 2015/7/7.
 */
public class ContentPlugin extends VideoPlugin implements OnFullScreenListener{

    private ViewGroup   mParentView;
    private VideoView   mVideoView;

    public ContentPlugin(PluginContext pluginContext, PluginEntry pluginEntry) {
        super(pluginContext, pluginEntry);
    }

    @Override
    public void onCreated() {
        super.onCreated();
        mParentView = findViewById(R.id.fr_parent_view);
        mVideoView  = findViewById(R.id.vv_video);
        if( null != getVideoPlayer() && null != getVideoPlayer().getVideoEngine()){
            getVideoPlayer().getVideoEngine().onBindView(mVideoView, mParentView);
        }
    }

    @Override
    public void onBeforeFullScreen(boolean fullScreen) {

    }

    @Override
    public void onModeChanged(Mode mode) {
        super.onModeChanged(mode);
        getVideoPlayer().setScale(getVideoPlayer().getScale());
    }
}
