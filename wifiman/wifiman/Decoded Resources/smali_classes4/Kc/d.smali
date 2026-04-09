.class public final synthetic LKc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:LKc/e;


# direct methods
.method public synthetic constructor <init>(LKc/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKc/d;->a:LKc/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LKc/d;->a:LKc/e;

    invoke-static {v0}, LKc/e;->d(LKc/e;)V

    return-void
.end method
