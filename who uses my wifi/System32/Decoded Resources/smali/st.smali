.class public final synthetic Lst;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lut;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lut;Ljava/util/concurrent/Executor;I)V
    .locals 0

    .line 1
    iput p3, p0, Lst;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lst;->b:Lut;

    .line 4
    .line 5
    iput-object p2, p0, Lst;->c:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lst;->a:I

    .line 2
    .line 3
    check-cast p1, Lme0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lst;->b:Lut;

    .line 11
    .line 12
    iget-object v1, p0, Lst;->c:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lut;->a(Lme0;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Lst;->b:Lut;

    .line 20
    .line 21
    iget-object v1, p0, Lst;->c:Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, v1}, Lut;->a(Lme0;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
