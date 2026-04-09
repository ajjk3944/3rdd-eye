.class final LE0/L$b$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/L$b$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE0/L$b$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/L$b$b$a;

    invoke-direct {v0}, LE0/L$b$b$a;-><init>()V

    sput-object v0, LE0/L$b$b$a;->a:LE0/L$b$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/b;)V
    .locals 1

    invoke-interface {p1}, LE0/b;->p()LE0/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LE0/a;->t(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/b;

    invoke-virtual {p0, p1}, LE0/L$b$b$a;->a(LE0/b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
