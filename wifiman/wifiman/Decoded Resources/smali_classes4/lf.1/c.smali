.class public final synthetic Llf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Llf/l;

.field public final synthetic b:Lmf/a;


# direct methods
.method public synthetic constructor <init>(Llf/l;Lmf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf/c;->a:Llf/l;

    iput-object p2, p0, Llf/c;->b:Lmf/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llf/c;->a:Llf/l;

    iget-object v1, p0, Llf/c;->b:Lmf/a;

    invoke-static {v0, v1}, Llf/d$a;->a(Llf/l;Lmf/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
