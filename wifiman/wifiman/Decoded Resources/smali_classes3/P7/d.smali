.class public final synthetic LP7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LP7/c$e;


# direct methods
.method public synthetic constructor <init>(LP7/c$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP7/d;->a:LP7/c$e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LP7/d;->a:LP7/c$e;

    invoke-static {v0}, LP7/c$e;->c(LP7/c$e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
