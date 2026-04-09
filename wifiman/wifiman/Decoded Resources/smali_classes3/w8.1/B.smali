.class public final synthetic Lw8/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT7/c;


# direct methods
.method public synthetic constructor <init>(LT7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/B;->a:LT7/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw8/B;->a:LT7/c;

    check-cast p1, Lmd/a;

    invoke-static {v0, p1}, Lw8/C;->p0(LT7/c;Lmd/a;)Lmd/a;

    move-result-object p1

    return-object p1
.end method
