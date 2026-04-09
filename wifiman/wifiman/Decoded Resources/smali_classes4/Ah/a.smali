.class public final LAh/a;
.super Lii/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/a$a;
    }
.end annotation


# static fields
.field public static final e:LAh/a$a;

.field private static final f:LZh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LAh/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAh/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAh/a;->e:LAh/a$a;

    const-string v0, "clone"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LAh/a;->f:LZh/f;

    return-void
.end method

.method public constructor <init>(Loi/n;LBh/e;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lii/f;-><init>(Loi/n;LBh/e;)V

    return-void
.end method

.method public static final synthetic n()LZh/f;
    .locals 1

    sget-object v0, LAh/a;->f:LZh/f;

    return-object v0
.end method


# virtual methods
.method protected j()Ljava/util/List;
    .locals 14

    invoke-virtual {p0}, Lii/f;->m()LBh/e;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    sget-object v2, LAh/a;->f:LZh/f;

    sget-object v3, LBh/b$a;->DECLARATION:LBh/b$a;

    sget-object v4, LBh/g0;->a:LBh/g0;

    invoke-static {v0, v1, v2, v3, v4}, LDh/O;->l1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)LDh/O;

    move-result-object v0

    invoke-virtual {p0}, Lii/f;->m()LBh/e;

    move-result-object v1

    invoke-interface {v1}, LBh/e;->J0()LBh/b0;

    move-result-object v7

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v8

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v9

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    invoke-virtual {p0}, Lii/f;->m()LBh/e;

    move-result-object v1

    invoke-static {v1}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object v11

    sget-object v12, LBh/D;->OPEN:LBh/D;

    sget-object v13, LBh/t;->c:LBh/u;

    const/4 v6, 0x0

    move-object v5, v0

    invoke-virtual/range {v5 .. v13}, LDh/O;->n1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/O;

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
