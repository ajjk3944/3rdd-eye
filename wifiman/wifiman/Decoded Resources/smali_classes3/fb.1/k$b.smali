.class final Lfb/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfb/k;->D(Lgg/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfb/k;

.field final synthetic b:Lgg/b;


# direct methods
.method constructor <init>(Lfb/k;Lgg/b;)V
    .locals 0

    iput-object p1, p0, Lfb/k$b;->a:Lfb/k;

    iput-object p2, p0, Lfb/k$b;->b:Lgg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lfb/k;)V
    .locals 0

    invoke-static {p0}, Lfb/k$b;->c(Lfb/k;)V

    return-void
.end method

.method private static final c(Lfb/k;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lfb/k;->B(Lfb/k;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lfb/k$b;->b(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)Lgg/f;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfb/k$b;->a:Lfb/k;

    invoke-static {v0}, Lfb/k;->z(Lfb/k;)LGb/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGb/f;->i(LGb/b;)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lfb/k$b;->b:Lgg/b;

    iget-object v0, p0, Lfb/k$b;->a:Lfb/k;

    new-instance v1, Lfb/l;

    invoke-direct {v1, v0}, Lfb/l;-><init>(Lfb/k;)V

    invoke-virtual {p1, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
