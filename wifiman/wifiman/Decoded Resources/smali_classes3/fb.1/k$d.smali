.class final Lfb/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfb/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llb/c;Lfb/o;LGb/f;LAb/a;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfb/k;


# direct methods
.method constructor <init>(Lfb/k;)V
    .locals 0

    iput-object p1, p0, Lfb/k$d;->a:Lfb/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lfb/k;)Lfb/k;
    .locals 0

    invoke-static {p0}, Lfb/k$d;->c(Lfb/k;)Lfb/k;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lfb/k;)Lfb/k;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lfb/k$d;->b(LYg/J;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/J;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lfb/k$d;->a:Lfb/k;

    invoke-static {p1}, Lfb/k;->y(Lfb/k;)Lfb/o;

    move-result-object v0

    invoke-static {p1, v0}, Lfb/k;->v(Lfb/k;Lfb/o;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lfb/k$d;->a:Lfb/k;

    new-instance v1, Lfb/m;

    invoke-direct {v1, v0}, Lfb/m;-><init>(Lfb/k;)V

    invoke-virtual {p1, v1}, Lgg/b;->g0(Lkg/q;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
