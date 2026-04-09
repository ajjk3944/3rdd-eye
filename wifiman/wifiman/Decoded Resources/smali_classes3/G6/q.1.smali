.class public final LG6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/q;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LG6/q;
    .locals 1

    new-instance v0, LG6/q;

    invoke-direct {v0, p0}, LG6/q;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, LG6/a$c;->p(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public b()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LG6/q;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LG6/q;->c(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/q;->b()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
