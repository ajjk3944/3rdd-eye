.class public final Lv80;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Lv80;


# instance fields
.field public final a:Lt90;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv80;

    .line 2
    .line 3
    invoke-direct {v0}, Lv80;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv80;->b:Lv80;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt90;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lt90;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lv80;->a:Lt90;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lu80;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Lv80;->a:Lt90;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt90;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lu80;

    .line 12
    .line 13
    return-object p1
.end method
