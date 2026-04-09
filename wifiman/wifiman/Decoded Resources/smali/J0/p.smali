.class public final LJ0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE0/G;

.field private final b:LJ0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/G;LJ0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ0/p;->a:LE0/G;

    iput-object p2, p0, LJ0/p;->b:LJ0/d;

    return-void
.end method


# virtual methods
.method public final a()LJ0/n;
    .locals 5

    iget-object v0, p0, LJ0/p;->b:LJ0/d;

    iget-object v1, p0, LJ0/p;->a:LE0/G;

    new-instance v2, LJ0/j;

    invoke-direct {v2}, LJ0/j;-><init>()V

    new-instance v3, LJ0/n;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4, v1, v2}, LJ0/n;-><init>(Landroidx/compose/ui/e$c;ZLE0/G;LJ0/j;)V

    return-object v3
.end method
