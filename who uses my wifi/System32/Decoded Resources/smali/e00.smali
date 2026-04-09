.class public final synthetic Le00;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lt3;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lt3;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le00;->a:Lt3;

    .line 5
    .line 6
    iput-boolean p2, p0, Le00;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lgg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Le00;->a:Lt3;

    .line 5
    .line 6
    iget-boolean v2, p0, Le00;->b:Z

    .line 7
    .line 8
    invoke-virtual {p1, v1, v0, v2}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
