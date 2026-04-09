.class public final Lz/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/Y;
.implements Lz/A;


# static fields
.field public static final b:Lz/B;


# instance fields
.field private final synthetic a:Lz/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/B;

    invoke-direct {v0}, Lz/B;-><init>()V

    sput-object v0, Lz/B;->b:Lz/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lz/Z;->a:Lz/Z;

    iput-object v0, p0, Lz/B;->a:Lz/Z;

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Lz/B;->a:Lz/Z;

    invoke-virtual {v0, p1, p2, p3}, Lz/Z;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Lz/B;->a:Lz/Z;

    invoke-virtual {v0, p1, p2}, Lz/Z;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
