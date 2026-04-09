.class public interface abstract Lv10;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcom/sun/jna/Library;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lv10;

    .line 2
    .line 3
    sget-object v1, Lcom/sun/jna/win32/W32APIOptions;->ASCII_OPTIONS:Ljava/util/Map;

    .line 4
    .line 5
    const-string v2, "IPHlpAPI"

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Lcom/sun/jna/Native;->load(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/sun/jna/Library;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method
