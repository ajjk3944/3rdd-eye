.class public final synthetic Ly9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:LT/q0;


# direct methods
.method public synthetic constructor <init>(LT/q0;LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/t;->a:LT/q0;

    iput-object p2, p0, Ly9/t;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ly9/t;->a:LT/q0;

    iget-object v1, p0, Ly9/t;->b:LT/q0;

    invoke-static {v0, v1}, Ly9/s$b$a$a;->a(LT/q0;LT/q0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
