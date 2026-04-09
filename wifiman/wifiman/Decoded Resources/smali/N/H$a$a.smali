.class final LN/H$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$a;->a(Lmh/l;)Lc0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/H$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/H$a$a;

    invoke-direct {v0}, LN/H$a$a;-><init>()V

    sput-object v0, LN/H$a$a;->a:LN/H$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LN/H;)LN/I;
    .locals 0

    invoke-virtual {p2}, LN/H;->d()LN/I;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LN/H;

    invoke-virtual {p0, p1, p2}, LN/H$a$a;->a(Lc0/m;LN/H;)LN/I;

    move-result-object p1

    return-object p1
.end method
