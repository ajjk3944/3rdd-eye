.class public final synthetic Laf/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/n0;->a:Lmh/l;

    iput-object p2, p0, Laf/n0;->b:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Laf/n0;->a:Lmh/l;

    iget-object v1, p0, Laf/n0;->b:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Laf/m0$d$a;->a(Lmh/l;Ljava/lang/Boolean;)LYg/J;

    move-result-object v0

    return-object v0
.end method
