.class final Lm2/d$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/d$b;->executeInsert()J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lm2/d$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm2/d$b$a;

    invoke-direct {v0}, Lm2/d$b$a;-><init>()V

    sput-object v0, Lm2/d$b$a;->a:Lm2/d$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/sqlite/db/SupportSQLiteStatement;)Ljava/lang/Long;
    .locals 2

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeInsert()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/sqlite/db/SupportSQLiteStatement;

    invoke-virtual {p0, p1}, Lm2/d$b$a;->a(Landroidx/sqlite/db/SupportSQLiteStatement;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
