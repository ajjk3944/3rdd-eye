.class public final Lqw;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Z

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public c:Lry;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqw;->d:I

    iput-object p1, p0, Lqw;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lqw;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lxw;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqw;->d:I

    .line 5
    iput-object p1, p0, Lqw;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lqw;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lqw;->a:Z

    .line 4
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lqw;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method
