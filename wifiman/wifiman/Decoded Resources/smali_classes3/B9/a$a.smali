.class final LB9/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB9/a;->b(LA/y;Ljava/util/List;Lmh/l;Lmh/l;ZZLmh/q;Lmh/q;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LB9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB9/a$a;

    invoke-direct {v0}, LB9/a$a;-><init>()V

    sput-object v0, LB9/a$a;->a:LB9/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LB9/a$a;->a(I)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
