.class public final Ly0/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private a:Ly0/H;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Ly0/O;->a:Ly0/H;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ly0/H;->d(Z)V

    :goto_0
    return-void
.end method

.method public final b(Ly0/H;)V
    .locals 0

    iput-object p1, p0, Ly0/O;->a:Ly0/H;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Ly0/O;->a(Z)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
