.class public final synthetic Lxe/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lf2/w;

.field public final synthetic b:LIi/N;

.field public final synthetic c:LN/n0;


# direct methods
.method public synthetic constructor <init>(Lf2/w;LIi/N;LN/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/v;->a:Lf2/w;

    iput-object p2, p0, Lxe/v;->b:LIi/N;

    iput-object p3, p0, Lxe/v;->c:LN/n0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lxe/v;->a:Lf2/w;

    iget-object v1, p0, Lxe/v;->b:LIi/N;

    iget-object v2, p0, Lxe/v;->c:LN/n0;

    invoke-static {v0, v1, v2}, Lxe/B;->k(Lf2/w;LIi/N;LN/n0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
