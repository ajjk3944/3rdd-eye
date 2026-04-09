.class final Lbf/q$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q$b$a;->a(Lz/d;ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbf/k;

.field final synthetic b:Lbf/e;


# direct methods
.method constructor <init>(Lbf/k;Lbf/e;)V
    .locals 0

    iput-object p1, p0, Lbf/q$b$a$a;->a:Lbf/k;

    iput-object p2, p0, Lbf/q$b$a$a;->b:Lbf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbf/q$b$a$a;->a:Lbf/k;

    iget-object v0, p0, Lbf/q$b$a$a;->b:Lbf/e;

    invoke-virtual {v0}, Lbf/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbf/k;->p0(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lbf/q$b$a$a;->a(Ljava/lang/String;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
