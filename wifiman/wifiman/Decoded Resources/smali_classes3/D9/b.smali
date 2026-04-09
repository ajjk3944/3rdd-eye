.class public final synthetic LD9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LD9/p;


# direct methods
.method public synthetic constructor <init>(LD9/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/b;->a:LD9/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD9/b;->a:LD9/p;

    invoke-static {v0}, LD9/k;->e(LD9/p;)LD9/o;

    move-result-object v0

    return-object v0
.end method
