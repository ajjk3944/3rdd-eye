.class public final synthetic Lh10;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lj10;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lj10;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh10;->a:Lj10;

    .line 5
    .line 6
    iput p2, p0, Lh10;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lgg0;->l:Lgg0;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lgg0;->j(Ljava/lang/String;Lgg0;)Lgg0;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Lf11; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    sget-object v0, Lj10;->g:Li80;

    .line 11
    .line 12
    iget-object v1, p0, Lh10;->a:Lj10;

    .line 13
    .line 14
    iget-object v1, v1, Lj10;->c:Ljava/nio/file/Path;

    .line 15
    .line 16
    iget v2, p0, Lh10;->b:I

    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    filled-new-array {p1, v1, v2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v1, "Could not decode name {}, {}#L{}, skipping"

    .line 27
    .line 28
    invoke-interface {v0, v1, p1}, Li80;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method
