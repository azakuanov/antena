package de.danoeh.antennapod;

import org.greenrobot.eventbus.meta.SimpleSubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberMethodInfo;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

/** This class is generated by EventBus, do not edit. */
public class ApEventBusIndex implements SubscriberInfoIndex {
    private static final Map<Class<?>, SubscriberInfo> SUBSCRIBER_INDEX;

    static {
        SUBSCRIBER_INDEX = new HashMap<Class<?>, SubscriberInfo>();

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.DownloadLogFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onDownloadLogChanged", de.danoeh.antennapod.core.event.DownloadLogEvent.class),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.FavoriteEpisodesFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", de.danoeh.antennapod.core.event.FavoritesEvent.class),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.QueueFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.QueueEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.SearchFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.CompletedDownloadsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onDownloadLogChanged", de.danoeh.antennapod.core.event.DownloadLogEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.FeedItemlistFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEvent", de.danoeh.antennapod.core.feed.FeedEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onFeedListChanged", de.danoeh.antennapod.core.event.FeedListUpdateEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.preferences.GpodderPreferencesFragment.class,
                true, new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("syncStatusChanged", de.danoeh.antennapod.core.event.SyncServiceEvent.class,
                    ThreadMode.MAIN, 0, true),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.PlaybackHistoryFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onHistoryUpdated", de.danoeh.antennapod.core.event.PlaybackHistoryEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.ItemPagerFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.RunningDownloadsFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onEvent", de.danoeh.antennapod.core.event.DownloadEvent.class, ThreadMode.MAIN, 0,
                    true),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.activity.OnlineFeedViewActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onFeedListChanged", de.danoeh.antennapod.core.event.FeedListUpdateEvent.class),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("playbackStateChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.EpisodesListFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onFeedListChanged", de.danoeh.antennapod.core.event.FeedListUpdateEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.ChaptersFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.ItemFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.FeedItemEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
            new SubscriberMethodInfo("onPlayerStatusChanged", de.danoeh.antennapod.core.event.PlayerStatusEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.NavDrawerFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onFeedListChanged", de.danoeh.antennapod.core.event.FeedListUpdateEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onQueueChanged", de.danoeh.antennapod.core.event.QueueEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.CoverFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.activity.MainActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.MessageEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.activity.MediaplayerActivity.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.QuickFeedDiscoveryFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onDiscoveryDefaultUpdateEvent",
                    de.danoeh.antennapod.core.event.DiscoveryDefaultUpdateEvent.class, ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.SubscriptionFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onFeedListChanged", de.danoeh.antennapod.core.event.FeedListUpdateEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("onUnreadItemsChanged",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.DownloadEvent.class,
                    ThreadMode.MAIN, 0, true),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.AudioPlayerFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onUnreadItemsUpdate",
                    de.danoeh.antennapod.core.event.UnreadItemsUpdateEvent.class, ThreadMode.MAIN),
            new SubscriberMethodInfo("updatePosition", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
            new SubscriberMethodInfo("favoritesChanged", de.danoeh.antennapod.core.event.FavoritesEvent.class,
                    ThreadMode.MAIN),
        }));

        putIndex(new SimpleSubscriberInfo(de.danoeh.antennapod.fragment.ExternalPlayerFragment.class, true,
                new SubscriberMethodInfo[] {
            new SubscriberMethodInfo("onEventMainThread", de.danoeh.antennapod.core.event.PlaybackPositionEvent.class,
                    ThreadMode.MAIN),
        }));

    }

    private static void putIndex(SubscriberInfo info) {
        SUBSCRIBER_INDEX.put(info.getSubscriberClass(), info);
    }

    @Override
    public SubscriberInfo getSubscriberInfo(Class<?> subscriberClass) {
        SubscriberInfo info = SUBSCRIBER_INDEX.get(subscriberClass);
        if (info != null) {
            return info;
        } else {
            return null;
        }
    }
}
