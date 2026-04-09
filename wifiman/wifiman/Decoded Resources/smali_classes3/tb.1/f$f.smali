.class final synthetic Ltb/f$f;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/f;->y(Lorg/webrtc/DataChannel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string/jumbo v5, "processState(Lorg/webrtc/DataChannel$State;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Ltb/f;

    const-string/jumbo v4, "processState"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/webrtc/DataChannel$State;)V
    .locals 1

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Ltb/f;

    invoke-static {v0, p1}, Ltb/f;->f(Ltb/f;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/webrtc/DataChannel$State;

    invoke-virtual {p0, p1}, Ltb/f$f;->a(Lorg/webrtc/DataChannel$State;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
