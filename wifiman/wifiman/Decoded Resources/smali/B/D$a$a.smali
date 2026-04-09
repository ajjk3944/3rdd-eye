.class public final LB/D$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/D$a;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/C;


# direct methods
.method public constructor <init>(LB/C;)V
    .locals 0

    iput-object p1, p0, LB/D$a$a;->a:LB/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, LB/D$a$a;->a:LB/C;

    invoke-virtual {v0}, LB/C;->f()V

    return-void
.end method
