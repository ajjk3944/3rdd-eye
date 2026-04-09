.class LDh/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/a;-><init>(Loi/n;LZh/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/a;


# direct methods
.method constructor <init>(LDh/a;)V
    .locals 0

    iput-object p1, p0, LDh/a$b;->a:LDh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lii/k;
    .locals 2

    new-instance v0, Lii/g;

    iget-object v1, p0, LDh/a$b;->a:LDh/a;

    invoke-virtual {v1}, LDh/a;->E0()Lii/k;

    move-result-object v1

    invoke-direct {v0, v1}, Lii/g;-><init>(Lii/k;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/a$b;->a()Lii/k;

    move-result-object v0

    return-object v0
.end method
