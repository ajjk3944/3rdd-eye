.class public final LG6/i;
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

    iput-object p1, p0, LG6/i;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LG6/i;
    .locals 1

    new-instance v0, LG6/i;

    invoke-direct {v0, p0}, LG6/i;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Landroid/content/ContentResolver;
    .locals 0

    invoke-static {p0}, LG6/a$c;->h(Landroid/content/Context;)Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ContentResolver;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/content/ContentResolver;
    .locals 1

    iget-object v0, p0, LG6/i;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LG6/i;->c(Landroid/content/Context;)Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/i;->b()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method
