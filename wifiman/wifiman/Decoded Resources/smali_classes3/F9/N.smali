.class public final synthetic LF9/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LD9/o;

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LD9/o;Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/N;->a:LD9/o;

    iput-object p2, p0, LF9/N;->b:Lmh/l;

    iput-object p3, p0, LF9/N;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LF9/N;->a:LD9/o;

    iget-object v1, p0, LF9/N;->b:Lmh/l;

    iget-object v2, p0, LF9/N;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, LF9/M$b$a;->a(LD9/o;Lmh/l;Ljava/lang/Object;)LYg/J;

    move-result-object v0

    return-object v0
.end method
