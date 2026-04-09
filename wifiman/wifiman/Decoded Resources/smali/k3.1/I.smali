.class public final synthetic Lk3/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk3/M$b;


# instance fields
.field public final synthetic a:Lk3/M;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lk3/M;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/I;->a:Lk3/M;

    iput-wide p2, p0, Lk3/I;->b:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk3/I;->a:Lk3/M;

    iget-wide v1, p0, Lk3/I;->b:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lk3/M;->s0(Lk3/M;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
