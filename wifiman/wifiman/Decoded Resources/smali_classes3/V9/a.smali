.class public final synthetic LV9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:LV9/f;


# direct methods
.method public synthetic constructor <init>(LIi/N;LV9/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV9/a;->a:LIi/N;

    iput-object p2, p0, LV9/a;->b:LV9/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LV9/a;->a:LIi/N;

    iget-object v1, p0, LV9/a;->b:LV9/f;

    invoke-static {v0, v1}, LV9/e;->a(LIi/N;LV9/f;)LYg/J;

    move-result-object v0

    return-object v0
.end method
