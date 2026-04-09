.class public final LG6/y;
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

    iput-object p1, p0, LG6/y;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LG6/y;
    .locals 1

    new-instance v0, LG6/y;

    invoke-direct {v0, p0}, LG6/y;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, LG6/a$c;->x(Landroid/content/Context;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LG6/y;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LG6/y;->c(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/y;->b()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
