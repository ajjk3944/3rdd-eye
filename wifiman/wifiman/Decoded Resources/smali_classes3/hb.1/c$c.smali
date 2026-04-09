.class final Lhb/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c;->D()Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;


# direct methods
.method constructor <init>(Lhb/c;)V
    .locals 0

    iput-object p1, p0, Lhb/c$c;->a:Lhb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llb/o;Llb/b;)Lpb/l;
    .locals 2

    const-string/jumbo v0, "cloudConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudCredentials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpb/l;

    iget-object v1, p0, Lhb/c$c;->a:Lhb/c;

    invoke-static {v1}, Lhb/c;->w(Lhb/c;)Llb/c;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lpb/l;-><init>(Llb/o;Llb/b;Llb/c;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/o;

    check-cast p2, Llb/b;

    invoke-virtual {p0, p1, p2}, Lhb/c$c;->a(Llb/o;Llb/b;)Lpb/l;

    move-result-object p1

    return-object p1
.end method
