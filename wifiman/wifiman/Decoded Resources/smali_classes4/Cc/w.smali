.class public final synthetic LCc/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LCc/p;

.field public final synthetic b:La8/a;


# direct methods
.method public synthetic constructor <init>(LCc/p;La8/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCc/w;->a:LCc/p;

    iput-object p2, p0, LCc/w;->b:La8/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LCc/w;->a:LCc/p;

    iget-object v1, p0, LCc/w;->b:La8/a;

    check-cast p1, LDc/j;

    invoke-static {v0, v1, p1}, LCc/p$e;->f(LCc/p;La8/a;LDc/j;)LYg/J;

    move-result-object p1

    return-object p1
.end method
