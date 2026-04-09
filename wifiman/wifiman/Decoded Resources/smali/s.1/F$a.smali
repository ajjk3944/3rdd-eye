.class final Ls/F$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls/F$a;

    invoke-direct {v0}, Ls/F$a;-><init>()V

    sput-object v0, Ls/F$a;->a:Ls/F$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 7

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v2

    sget-object v4, Ls/F$a$a;->a:Ls/F$a$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
