.class public final synthetic LKc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# instance fields
.field public final synthetic a:LKc/e;


# direct methods
.method public synthetic constructor <init>(LKc/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKc/c;->a:LKc/e;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LKc/c;->a:LKc/e;

    check-cast p1, Lgg/h;

    invoke-static {v0, p1}, LKc/e;->c(LKc/e;Lgg/h;)V

    return-void
.end method
