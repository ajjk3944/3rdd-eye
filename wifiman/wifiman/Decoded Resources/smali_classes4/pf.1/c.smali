.class public final synthetic Lpf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lpf/b;

.field public final synthetic c:Lpf/b$a;

.field public final synthetic d:Lmh/a;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lpf/b;Lpf/b$a;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf/c;->a:LIi/N;

    iput-object p2, p0, Lpf/c;->b:Lpf/b;

    iput-object p3, p0, Lpf/c;->c:Lpf/b$a;

    iput-object p4, p0, Lpf/c;->d:Lmh/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpf/c;->a:LIi/N;

    iget-object v1, p0, Lpf/c;->b:Lpf/b;

    iget-object v2, p0, Lpf/c;->c:Lpf/b$a;

    iget-object v3, p0, Lpf/c;->d:Lmh/a;

    invoke-static {v0, v1, v2, v3}, Lpf/d$a$a;->a(LIi/N;Lpf/b;Lpf/b$a;Lmh/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
