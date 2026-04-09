.class public final synthetic Lj8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT7/b;


# direct methods
.method public synthetic constructor <init>(LT7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/b;->a:LT7/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj8/b;->a:LT7/b;

    check-cast p1, Lmd/a;

    invoke-static {v0, p1}, Lj8/c;->e(LT7/b;Lmd/a;)Lmd/a;

    move-result-object p1

    return-object p1
.end method
