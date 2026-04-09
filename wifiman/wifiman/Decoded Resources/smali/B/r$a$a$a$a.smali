.class public final LB/r$a$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/r$a$a$a;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/r$a;


# direct methods
.method public constructor <init>(LB/r$a;)V
    .locals 0

    iput-object p1, p0, LB/r$a$a$a$a;->a:LB/r$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LB/r$a$a$a$a;->a:LB/r$a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LB/r$a;->b(LB/r$a;Lmh/p;)V

    return-void
.end method
