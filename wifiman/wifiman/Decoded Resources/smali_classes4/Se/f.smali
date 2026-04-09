.class public final synthetic LSe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:LSe/c;


# direct methods
.method public synthetic constructor <init>(LT/q0;LSe/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSe/f;->a:LT/q0;

    iput-object p2, p0, LSe/f;->b:LSe/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LSe/f;->a:LT/q0;

    iget-object v1, p0, LSe/f;->b:LSe/c;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, LSe/e$a$a$b;->a(LT/q0;LSe/c;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
