.class public final synthetic LFf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LFf/e;

.field public final synthetic b:LT/o0;


# direct methods
.method public synthetic constructor <init>(LFf/e;LT/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFf/j;->a:LFf/e;

    iput-object p2, p0, LFf/j;->b:LT/o0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LFf/j;->a:LFf/e;

    iget-object v1, p0, LFf/j;->b:LT/o0;

    check-cast p1, Lic/b;

    invoke-static {v0, v1, p1}, LFf/i$a$b$a;->a(LFf/e;LT/o0;Lic/b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
