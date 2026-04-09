.class final Ltb/N$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/N;-><init>(Ljava/util/List;Ljava/lang/String;Lpb/l;Llb/c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/N;


# direct methods
.method constructor <init>(Ltb/N;)V
    .locals 0

    iput-object p1, p0, Ltb/N$m;->a:Ltb/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ltb/N;Lorg/webrtc/DataChannel$State;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N$m;->c(Ltb/N;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method

.method private static final c(Ltb/N;Lorg/webrtc/DataChannel$State;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/webrtc/DataChannel$State;->OPEN:Lorg/webrtc/DataChannel$State;

    if-ne p1, v0, :cond_0

    sget-object p1, Ltb/N$c;->CONNECTED:Ltb/N$c;

    invoke-static {p0, p1}, Ltb/N;->s(Ltb/N;Ltb/N$c;)V

    invoke-static {p0}, Ltb/N;->x(Ltb/N;)Lpb/l;

    move-result-object p0

    invoke-virtual {p0}, Lpb/l;->p()V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ltb/f;

    invoke-virtual {p0, p1}, Ltb/N$m;->b(Ltb/f;)V

    return-void
.end method

.method public final b(Ltb/f;)V
    .locals 2

    iget-object v0, p0, Ltb/N$m;->a:Ltb/N;

    new-instance v1, Ltb/O;

    invoke-direct {v1, v0}, Ltb/O;-><init>(Ltb/N;)V

    invoke-virtual {p1, v1}, Ltb/f;->g(Ltb/f$c;)V

    return-void
.end method
