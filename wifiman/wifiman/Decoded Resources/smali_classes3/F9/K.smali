.class public final synthetic LF9/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LD9/o;


# direct methods
.method public synthetic constructor <init>(LD9/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/K;->a:LD9/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF9/K;->a:LD9/o;

    invoke-static {v0}, LF9/M;->a(LD9/o;)LYg/J;

    move-result-object v0

    return-object v0
.end method
