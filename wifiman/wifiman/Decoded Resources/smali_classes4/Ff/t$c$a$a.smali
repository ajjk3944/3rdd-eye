.class public final LFf/t$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/t$c$a;->b(ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;


# direct methods
.method public constructor <init>(LFf/e;)V
    .locals 0

    iput-object p1, p0, LFf/t$c$a$a;->a:LFf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LFf/t$c$a$a;->a:LFf/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LFf/e;->A0(Z)V

    return-void
.end method
