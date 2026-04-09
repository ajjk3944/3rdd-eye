.class public final synthetic LN8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LN8/p;


# direct methods
.method public synthetic constructor <init>(LN8/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN8/n;->a:LN8/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN8/n;->a:LN8/p;

    invoke-static {v0}, LN8/p;->p0(LN8/p;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
