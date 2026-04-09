.class final Ln8/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/k;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/k$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/k$d;

    invoke-direct {v0}, Ln8/k$d;-><init>()V

    sput-object v0, Ln8/k$d;->a:Ln8/k$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJe/m;)La8/b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La8/b;->c:La8/b$a;

    invoke-virtual {p1}, LJe/m;->b()Lh9/a;

    move-result-object p1

    invoke-virtual {v0, p1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJe/m;

    invoke-virtual {p0, p1}, Ln8/k$d;->a(LJe/m;)La8/b;

    move-result-object p1

    return-object p1
.end method
