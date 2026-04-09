.class public final Lw/A$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/A$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/A;

.field final synthetic b:Lw/p;


# direct methods
.method constructor <init>(Lw/A;Lw/p;)V
    .locals 0

    iput-object p1, p0, Lw/A$b$a;->a:Lw/A;

    iput-object p2, p0, Lw/A$b$a;->b:Lw/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 4

    iget-object v0, p0, Lw/A$b$a;->a:Lw/A;

    iget-object v1, p0, Lw/A$b$a;->b:Lw/p;

    invoke-virtual {v0, p1}, Lw/A;->B(F)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lw/A;->u(J)J

    move-result-wide v2

    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->a()I

    move-result p1

    invoke-interface {v1, v2, v3, p1}, Lw/p;->a(JI)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lw/A;->A(J)F

    move-result p1

    invoke-virtual {v0, p1}, Lw/A;->t(F)F

    move-result p1

    return p1
.end method
