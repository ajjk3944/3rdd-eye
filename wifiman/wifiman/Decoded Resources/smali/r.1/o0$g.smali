.class final Lr/o0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/o0;-><init>(Lr/q0;Lr/o0;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;


# direct methods
.method constructor <init>(Lr/o0;)V
    .locals 0

    iput-object p1, p0, Lr/o0$g;->a:Lr/o0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lr/o0$g;->a:Lr/o0;

    invoke-static {v0}, Lr/o0;->a(Lr/o0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr/o0$g;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
