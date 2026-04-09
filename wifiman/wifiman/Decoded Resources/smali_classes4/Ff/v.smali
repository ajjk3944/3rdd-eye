.class public final synthetic LFf/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LFf/e;


# direct methods
.method public synthetic constructor <init>(LFf/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFf/v;->a:LFf/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFf/v;->a:LFf/e;

    check-cast p1, LT/L;

    invoke-static {v0, p1}, LFf/t$c$a;->a(LFf/e;LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
