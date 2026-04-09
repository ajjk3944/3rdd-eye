.class public final synthetic LI7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:LI7/P;


# direct methods
.method public synthetic constructor <init>(LI7/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/t;->a:LI7/P;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LI7/t;->a:LI7/P;

    invoke-static {v0}, LI7/P;->u(LI7/P;)V

    return-void
.end method
