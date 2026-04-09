.class public final synthetic LM8/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LS8/c;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(LS8/c;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/J;->a:LS8/c;

    iput-object p2, p0, LM8/J;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM8/J;->a:LS8/c;

    iget-object v1, p0, LM8/J;->b:Lmh/l;

    check-cast p1, Lle/i;

    invoke-static {v0, v1, p1}, LM8/K$a;->b(LS8/c;Lmh/l;Lle/i;)LBf/c;

    move-result-object p1

    return-object p1
.end method
