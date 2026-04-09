.class public final LL6/d;
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

    iput-object p1, p0, LL6/d;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LL6/d;
    .locals 1

    new-instance v0, LL6/d;

    invoke-direct {v0, p0}, LL6/d;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(LP6/i;)LL6/c;
    .locals 1

    new-instance v0, LL6/c;

    invoke-direct {v0, p0}, LL6/c;-><init>(LP6/i;)V

    return-object v0
.end method


# virtual methods
.method public b()LL6/c;
    .locals 1

    iget-object v0, p0, LL6/d;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/i;

    invoke-static {v0}, LL6/d;->c(LP6/i;)LL6/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL6/d;->b()LL6/c;

    move-result-object v0

    return-object v0
.end method
